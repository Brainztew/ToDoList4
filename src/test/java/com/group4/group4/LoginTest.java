// package com.group4.group4;

// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import org.junit.jupiter.api.Test;



// import java.util.ArrayList;
// import java.util.List;


// public class LoginTest {

//     // Statisk lista över användare för testning
//     private static List<User> userList = new ArrayList<>();

//     // Metod för att kontrollera inloggningsuppgifter
//     public static boolean isValidUser(String enteredName, String enteredPassword) {
//         for (User user : userList) {
//             if (user.getName().equals(enteredName) && user.getPassword().equals(enteredPassword)) {
//                 return true; // Login ger successful
//             }
//         }
//         return false; // Login ger failed
//     }

//     // Metod lägger till user
//     public static void addUser(String name, String password) {
//         userList.add(new User(name, password));
//     }

//     // Metod tar bort
//     public static void removeUser(String name) {
//         userList.removeIf(user -> user.getName().equals(name));
//     }

//     ////////////////////////////////////////////////////////////////////////

//     // add
//     @Test
//     public void testAddUser() {
//         // Test adding a user
//         addUser("Johan", "Sthlm");
//         assertTrue(isValidUser("Johan", "Sthlm"));      // ska ge true vid rätt
//         assertFalse(isValidUser("Johan", "Sthlm1234")); // ska ge true vid fel
//     }

//     // remove a user
//     @Test
//     public void testRemoveUser() {
//         // Lägger till user för test
//         addUser("Bengt", "Kista");

//         // Testar att ta bort användaren
//         removeUser("Bengt");
//         assertFalse(isValidUser("Bengt", "Kista"));
//     }

//     // valid user
//     @Test
//     public void testValidUser() {
//         // Skapa en statisk användare för testning
//         userList.add(new User("testUser", "pass123"));

//         // Test med correct inloggningsuppgifter
//         assertTrue(isValidUser("testUser", "pass123"));
//     }

//     // invalid user
//     @Test
//     public void testInvalidUser() {
//         // Skapa en statisk användare för testning
//         userList.add(new User("testUser", "password123"));

//         // Test med inkorrekt inloggningsuppgifter
//         assertFalse(isValidUser("testUser", "wrongPassword"));
//     }


// }