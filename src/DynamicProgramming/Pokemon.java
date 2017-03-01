package DynamicProgramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by anusha on 11/20/16.
 */
public class Pokemon {

    static class PokeMap {

        private final long[][] grid;

        PokeMap(long[][] grid) {
            this.grid = grid;
        }

        public long getSizeX() {
            return grid[0].length;
        }

        public long getSizeY() {
            return grid.length;
        }

        public long getValue(Location loc) {
            return getValue(loc.getX(), loc.getY());
        }

        long getValue(int x, int y) {
            if (y >= grid.length || x >= grid[y].length) {
                throw new IllegalArgumentException("Requested coordinates outside of map");
            }
            return grid[y][x];
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String lineSeparator = System.getProperty("line.separator");
            for (long[] row : grid) {
                sb.append(Arrays.toString(row)).append(lineSeparator);
            }
            return sb.toString();
        }
    }

    static class Location {

        private final int x;
        private final int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getY() {
            return y;
        }

        int getX() {
            return x;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static double sqrt(double a) {
        return Math.sqrt(a);
    }

    private static double log10(double a) {
        return Math.log10(a);
    }

    private static double roundToPlaces(double d, int numDecimalPlaces) {
        int scaleFactor = (int) Math.pow(10, numDecimalPlaces);
        return Math.floor(d * scaleFactor) / scaleFactor;
    }

    private static double euclideanDist(int x1, int x2, int y1, int y2){
        int x = x2-x1;
        int y = y2-y1;
        return sqrt((x*x) + (y*y));
    }

    private static double calcGainedXP(long pokemonXP, double euclideanDist){
        double cost = euclideanDist + log10(pokemonXP);
        return pokemonXP/cost;
    }


    /**
     * Complete the function below
     */
    private static double findMaximumXP(Location playerPosition, long numPokeBalls, PokeMap pokeMap) {
        double xp =0;
        int playerX = playerPosition.getX();
        int playerY = playerPosition.getY();
        ArrayList<Double> sortedXP = new ArrayList<>();
        for(long i=0;i< pokeMap.getSizeX();i++){
            for(long j=0;j<pokeMap.getSizeY();j++){
                if(pokeMap.getValue((int)i,(int)j) > 0){
                    double dist = euclideanDist(playerX, (int)i, playerY, (int)j);
                    double gainedXP = calcGainedXP(pokeMap.getValue((int)i,(int)j), dist);
                    sortedXP.add(gainedXP);
                }
            }
        }

        Collections.sort(sortedXP);
        double finalXP = 0;
        for(int i = sortedXP.size()-1; i >sortedXP.size()-1-numPokeBalls; i--){
            finalXP+=sortedXP.get(i);
        }
        return roundToPlaces(finalXP,3);
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        double res;

        int _startPosition_size = 0;
        _startPosition_size = Integer.parseInt(in.nextLine().trim());
        long[] _startPosition = new long[_startPosition_size];
        long _startPosition_item;
        for (int _startPosition_i = 0; _startPosition_i < _startPosition_size; _startPosition_i++) {
            _startPosition_item = Long.parseLong(in.nextLine().trim());
            _startPosition[_startPosition_i] = _startPosition_item;
        }

        Location startPosition = new Location((int) _startPosition[0], (int) _startPosition[1]);

        long _numPokeBalls;
        _numPokeBalls = Long.parseLong(in.nextLine().trim());


        int _pokeMap_rows = 0;
        int _pokeMap_cols = 0;
        _pokeMap_rows = Integer.parseInt(in.nextLine().trim());
        _pokeMap_cols = Integer.parseInt(in.nextLine().trim());

        long[][] _pokeMap = new long[_pokeMap_rows][_pokeMap_cols];
        for (int _pokeMap_i = 0; _pokeMap_i < _pokeMap_rows; _pokeMap_i++) {
            for (int _pokeMap_j = 0; _pokeMap_j < _pokeMap_cols; _pokeMap_j++) {
                _pokeMap[_pokeMap_i][_pokeMap_j] = in.nextLong();

            }
        }

        PokeMap pokeMap = new PokeMap(_pokeMap);

        if (in.hasNextLine()) {
            in.nextLine();
        }

        res = findMaximumXP(startPosition, _numPokeBalls, pokeMap);
        bw.write(String.format(java.util.Locale.US, "%.3f", res));
        bw.newLine();

        bw.close();
    }
}
