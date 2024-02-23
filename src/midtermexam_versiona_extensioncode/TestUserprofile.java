/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author tybutler
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        String name;
        String actor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your favourite actor: ");
        actor = sc.nextLine();
        UserProfile user1 = new UserProfile(name, actor);
        System.out.println("User Created!");
        
        
    }
}
