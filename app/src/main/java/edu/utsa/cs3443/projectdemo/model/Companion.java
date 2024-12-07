package edu.utsa.cs3443.projectdemo.model;

import android.app.Activity;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Companion {

    private ArrayList<ClothingItem> lockedClothes;
    private String name;
    private int swag;
    private int love;
    private int outfitScore;
    private boolean gameTime;
    private ArrayList<ClothingItem> inventory;
    private ArrayList<ClothingItem> currentClothes;
    private ArrayList<Outfit> favorites;

    public Companion(String name) {
        this.name = name;
        love = swag = 5;
        outfitScore = 0;
        gameTime = true;
        inventory = null;
        currentClothes = null;
        favorites = null;
        lockedClothes = new ArrayList<ClothingItem>();
    }

    public void loadClothingItems(Activity activity) {
        AssetManager manager = activity.getAssets();
        Scanner scan = null;
        String fileName = "clothingitems.csv";
        try {
            InputStream file = manager.open(fileName);
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] token = scan.nextLine().split("");
                String type = token[0];
                switch (type) {
                    case "Shirt":
                        ClothingItem temp = new Shirt(token[1], Integer.parseInt(token[2]), token[3], token[4]);
                        lockedClothes.add(temp);
                        break;
                    case "Pants":
                        ClothingItem temp2 = new Pants(token[1], Integer.parseInt(token[2]), token[3], token[4]);
                        lockedClothes.add(temp2);
                        break;
                    case "Shoes":
                        ClothingItem temp3 = new Shoes(token[1], Integer.parseInt(token[2]), token[3], token[4]);
                        lockedClothes.add(temp3);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Whoopsie");
        }
    }

}