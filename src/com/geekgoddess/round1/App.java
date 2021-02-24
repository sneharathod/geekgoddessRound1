package com.geekgoddess.round1;

import java.util.HashSet;
import java.util.*;

public class App {
    public static void main(String args[]){
        int row = 5;
        int column = 5;
        int[][] cities = new int[row][column];
        /*cities[0] = new int[]{0, 0, 0, 0};
        cities[1] = new int[]{0, 1, 1, 0};
        cities[2] = new int[]{0, 1, 0, 0};
        cities[3] = new int[]{1, 1, 0, 1};
        cities[4] = new int[]{1, 1, 0, 1};*/

        cities[0] = new int[]{0, 0, 1, 0, 0};
        cities[1] = new int[]{0, 1, 1, 0, 0};
        cities[2] = new int[]{0, 0, 0, 0, 1};
        cities[3] = new int[]{1, 0, 1, 1, 1};
        cities[4] = new int[]{1, 1, 0, 1, 1};

        /*for(int i = 0; i < row; i++ ){
            for(int j = 0; j < column; j++){
                System.out.println( i + " =ij= "+j + " " + cities[i][j]);
            }
        }*/


        Set<Integer> results = new HashSet<>();
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < column ; j++) {
                int[][] traversed = new int[row][column];
                //set all as untraversed to 0
                for(int k = 0; k < row; k++){
                    for(int l = 0; l < column;l++){
                        traversed[k][l] = 0;
                    }
                }
                System.out.println(" findpath for i = "+ i + " j = "+j );
                int count = findPath(cities, traversed, i, j);
                System.out.println(" i = "+ i + " j = "+j + " count ="+ count);
                results.add(count);
            }
        }
        System.out.println(Collections.max(results));
    }

    private static int findPath(int[][] cities, int[][] traversed, int i, int j){
        int count = 0;
        int row = cities.length;
        int column =  cities[0].length;

        if( i > -1 && j > -1 && i < row && j < column) {
            if (traversed[i][j] == 0) {
                if (cities[i][j] == 1) {
                    count++;
                    traversed[i][j] = 1;
                    count += findPath(cities, traversed, i, j + 1);
                    count += findPath(cities, traversed, i, j - 1);
                    count += findPath(cities, traversed, i + 1, j + 1);
                    count += findPath(cities, traversed, i + 1, j - 1);
                    count += findPath(cities, traversed, i + 1, j );
                    count += findPath(cities, traversed, i - 1, j);
                    count += findPath(cities, traversed, i - 1, j - 1);
                    count += findPath(cities, traversed, i - 1, j + 1);

                }
            }
        }
        return count;
    }
    /*private static int findPath(int[][] cities, int[][] traversed, int i, int j){
        int count = 0;
        int row = cities.length;
        int column =  cities[i].length;

        if( i > -1 && j > -1 && i < row && j < column) {
            if (traversed[i][j] == 0) {
                if (cities[i][j] == 1) {
                    count++;
                    traversed[i][j] = 1;
                    for (int k = i; k < row; k++) {
                        for (int l = j ; l < column; l++) {
                            if(k == i && j == l){
                                continue;
                            }
                            else if (cities[k][l] == 1) {
                                count += findPath(cities, traversed, k, l);

                            } else {
                                break;
                            }
                        }
                        if(k+1 < row && cities[k+1][j] != 1){
                            break;
                        }
                    }
                    for (int k = i - 1; k > -1; k--) {
                        for (int l = j - 1; l > -1; l--) {
                            if (cities[k][l] == 1) {
                                count += findPath(cities, traversed, k, l);

                            } else {
                                break;
                            }
                        }
                        if(k-1 > -1 && cities[k-1][j] != 1){
                            break;
                        }
                    }
                    for (int k = i + 1; k < row ; k++) {
                        for (int l = j - 1; l > -1; l--) {
                            if(k == i && j == l){
                                continue;
                            }
                            if (cities[k][l] == 1) {
                                count += findPath(cities, traversed, k, l);

                            } else {
                                break;
                            }
                        }
                        if(k+1 < row && cities[k+1][j] != 1){
                            break;
                        }
                    }
                    for (int k = i - 1; k > -1; k--) {
                        for (int l = j ; l < column; l++) {
                            if (cities[k][l] == 1) {
                                count += findPath(cities, traversed, k, l);

                            } else {
                                break;
                            }
                        }
                        if(k-1 > -1 && cities[k-1][j] != 1){
                            break;
                        }
                    }
                }
                *//*if (cities[i][j] == 1) {
                    count++;
                    traversed[i][j] = 1;
                    //coder dominant city
                    //second ttry
                    for(int k = i+1; k < row ; k++){
                        count += findPath(cities, traversed, k, j);
                    }
                    for(int k = i-1 ; k > -1 ; k--){
                        count += findPath(cities, traversed, k, j);
                    }

                    for(int k = j+1 ; k < column ; k++){
                        count += findPath(cities, traversed, i, k);
                    }
                    for(int k = j-1 ; k > -1 ; k--){
                        count += findPath(cities, traversed, i, k);
                    }

                    //first try base
                    *//**//*count += findPath(cities, traversed, i, j + 1);
                    count += findPath(cities, traversed, i + 1, j + 1);
                    count += findPath(cities, traversed, i - 1, j);
                    count += findPath(cities, traversed, i, j - 1);
                    count += findPath(cities, traversed, i-1, j - 1);*//**//*
                }*//*
            }
        }
        return count;
    }*/
}