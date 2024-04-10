package BaiTap11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
     List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 20));
        teams.add(new FootballTeam(2, "Team B", 11, 30));
        teams.add(new FootballTeam(3, "Team C", 11, 10));
        teams.add(new FootballTeam(4, "Team D", 11, 40)); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bubbleSort(teams);
                break;
            case 2:
                selectionSort(teams);
                break;
            case 3:
                insertionSort(teams);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("Sorted teams:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }

    }
   
     public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (teams.get(j).getScore() < teams.get(j+1).getScore()) {
                    // swap teams[j+1] and teams[j]
                    FootballTeam temp = teams.get(j);
                    teams.set(j, teams.get(j+1));
                    teams.set(j+1, temp);
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n-1; i++) {
            int max_idx = i;
            for (int j = i+1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(max_idx).getScore()) {
                    max_idx = j;
                }
            }
            // Swap the found maximum element with the first element
            FootballTeam temp = teams.get(max_idx);
            teams.set(max_idx, teams.get(i));
            teams.set(i, temp);
        }
    }

    // Insertion Sort
    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; ++i) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }
}
