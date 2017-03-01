package DynamicProgramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by anusha on 11/20/16.
 */
public class Pokemon2 {
//    static class Pokemon implements Comparable<Pokemon>{
//
//        final double attack;
//        final double defense;
//        final double stamina;
//        double level;
//        double cp;
//
//        Pokemon(double attack, double defense, double stamina, double level) {
//            this.attack = attack;
//            this.defense = defense;
//            this.stamina = stamina;
//            this.level = level;
//            this.cp = 0;
//        }
//
//        void powerup(double multiplier){
//            level+=0.5;
//            this.cp = (this.attack * sqrt(this.defense) * sqrt(stamina) * multiplier * multiplier)/10;
//        }
//
//        public double compareTo(Pokemon pokemon) {
//
//            double compareQuantity = ((Pokemon) pokemon).cp;
//            return this.cp - compareQuantity;
//
//
//        }
//        public static Comparator<Pokemon> PokemonComparator
//                = new Comparator<Pokemon>() {
//
//            public double compare(Pokemon p1, Pokemon p2) {
//
//                double cp1 = p1.cp;
//                double cp2 = p2.cp;
//
//                //ascending order
//                return cp1.compareTo(cp2);
//
//                //descending order
//                //return fruitName2.compareTo(fruitName1);
//            }
//
//        };
//    }
//
//    static class CPMultiplier {
//
//        private final double[] multipliers;
//
//        CPMultiplier(double[] multipliers) {
//            this.multipliers = multipliers;
//        }
//
//
//        double getMultiplierForLevel(double level) {
//            if (level > 40.0d) {
//                return multipliers[multipliers.length - 1];
//            }
//            return multipliers[(int) (level * 2 - 2)];
//        }
//    }
//
//    private static double sqrt(double a) {
//        return Math.sqrt(a);
//    }
//
//    private static double roundToPlaces(double d, int numDecimalPlaces) {
//        int scaleFactor = (int) Math.pow(10, numDecimalPlaces);
//        return ((double) Math.floor(d * scaleFactor)) / scaleFactor;
//    }
//
//
//
//
///*
// * Complete the function below.
// */
//
//    static double findMaximumCPGained(long numPowerUps, Pokemon[] pokemonArray, CPMultiplier cpMultiplierMapping) {
//        Arrays.sort(pokemonArray);
//        while(numPowerUps > 0){
//
//        }
//
//    }⁠⁠⁠⁠
//
//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        double res;
//        long _numPowerUps;
//        _numPowerUps = Long.parseLong(in.nextLine().trim());
//
//
//        int _pokemon_rows = 0;
//        int _pokemon_cols = 0;
//        _pokemon_rows = Integer.parseInt(in.nextLine().trim());
//        _pokemon_cols = Integer.parseInt(in.nextLine().trim());
//
//        double[][] _pokemon = new double[_pokemon_rows][_pokemon_cols];
//
//        Pokemon[] pokemonArray = new Pokemon[_pokemon_rows];
//        for(int _pokemon_i=0; _pokemon_i<_pokemon_rows; _pokemon_i++) {
//            double attack = in.nextDouble();
//            double defense = in.nextDouble();
//            double stamina = in.nextDouble();
//            double level = in.nextDouble();
//            pokemonArray[_pokemon_i] = new Pokemon(attack, defense, stamina, level);
//        }
//
//        if(in.hasNextLine()) {
//            in.nextLine();
//        }
//
//        int _cpMultipliers_size = 0;
//        _cpMultipliers_size = Integer.parseInt(in.nextLine().trim());
//        double[] _cpMultipliers = new double[_cpMultipliers_size];
//        double _cpMultipliers_item;
//        for(int _cpMultipliers_i = 0; _cpMultipliers_i < _cpMultipliers_size; _cpMultipliers_i++) {
//            _cpMultipliers_item = Double.parseDouble(in.nextLine().trim());
//            _cpMultipliers[_cpMultipliers_i] = _cpMultipliers_item;
//        }
//
//        res = findMaximumCPGained(_numPowerUps, pokemonArray, new CPMultiplier(_cpMultipliers));
//        bw.write(String.format(java.util.Locale.US, "%.8f", res));
//        bw.newLine();
//
//        bw.close();
//    }
//
//    static int minimumSwaps(int[] popularity) {
//
//        /*
//        int[] sorted = popularity.clone();
//        Arrays.sort(sorted);
//
//        int swaps = 0;
//        int j = 0;
//        for (int i = 0; i< popularity.length; i++){
//            if(popularity[i] == sorted[j]) {
//                j++;
//            } else {
//                swaps++;
//            }
//        }
//        */
//        int swaps = 0;
//        int n = popularity.length;
//        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            pairs.add(new Pair<Integer, Integer> (popularity[i], i));
//        }
//
//        pairs.sort(new Comparator<Pair<Integer, Integer>>()
//        {
//            @Override
//            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
//                if(o1.getValue() > o2.getValue) {
//                    return -1;
//                } else if(o1.getValue().equals(o2.getValue())){
//                    return 0;
//                } else {
//                    return 1;
//                }
//            }
//        }
//        );
//        return swaps;
//    }


}
