package io;

import Models.Product;

import java.io.*;
import java.util.ArrayList;

public class WriteAndReader {
    public void write(ArrayList<Product> arr){
        File file = new File("C:\\Users\\ADMIN\\Desktop\\baithithu2\\baithithu2\\src\\Models\\product.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arr);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Product> Reader(){

        File file = new File("C:\\Users\\ADMIN\\Desktop\\baithithu2\\baithithu2\\src\\Models\\product.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return  (ArrayList<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("file k tồn tại");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("file chưa tồn tại");;
        }
        return new ArrayList<>();
    }
}
