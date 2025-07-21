# cafe_management_system
This is a Java-based Cafe Management System. It allows for managing products, categories, users, and orders within a cafe environment.

Features
User Authentication:

Login for existing users.


Forgot Password functionality with email-based recovery.


Signup for new users.

Product Management (Admin Only):

Add New Product: Admins can add new products with a name, category, and price.





View, Edit, and Delete Products.

Category Management (Admin Only):

Manage Categories.

User Management (Admin Only):

Verify Users.

Order Management:

Place Orders.

View Bills & Order Placed Details.

User Settings:

Change Password.

Change Security Question.

Application Control:

Logout.

Exit Application.

Technologies Used
Java Swing: For the graphical user interface.

NetBeans IDE: The .form files indicate that the UI was designed using NetBeans' GUI builder.

DAO (Data Access Object) Pattern: CategoryDao and ProductDao are used for database operations, suggesting interaction with a database (though the database connection details are not in the provided files).

Setup Instructions
Prerequisites:

Java Development Kit (JDK) 8 or higher.

NetBeans IDE (recommended for opening and modifying the .form files).

A compatible database (e.g., MySQL) and appropriate JDBC driver. (Database setup details are not included in the provided files but are necessary for full functionality).

Clone the Repository (or extract the zip file):

If this was a Git repository, you would clone it. Since it's a zip, extract the contents to your desired location.

Open in NetBeans:

Open NetBeans IDE.

Go to File > Open Project and navigate to the extracted project folder.

Configure Database Connection:

You will need to set up your database (e.g., create the cafe_management_system database and necessary tables for users, products, and categories).

Update the database connection details in the relevant DAO files (e.g., DbOperations.java or similar, which are not provided in this extract but are implied by UserDao and CategoryDao).

Build and Run:

Clean and Build the project in NetBeans (Run > Clean and Build Project).

Run the project (Run > Run Project).

How to Use
Login Page:

Enter your email and password to log in.

Use the "Forgot Password?" link if you need to reset your password.

New users can click "SignUp" to create an account.

Home Page:

Regular users will have options to "Place Order", "View Bills & Order Placed Details", "Change Password", "Change Security Question", "LogOut", and "Exit".

Admin users (e.g., 

admin@gmail.com) will have additional options for "Manage Category", "New Product", "View, Edit & Delete Product", and "Verify Users".

Project Structure (based on provided files)
cafe.management.system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cafe/
│   │   │       └── management/
│   │   │           └── system/
│   │   │               ├── AddNewProduct.java
│   │   │               ├── AddNewProduct.form
│   │   │               ├── ForgotPassword.java
│   │   │               ├── ForgotPassword.form
│   │   │               ├── Home.java
│   │   │               ├── Home.form
│   │   │               ├── Login.java
│   │   │               ├── Login.form
│   │   │               └── CafeManagementSystem.java (Main class)
│   │   └── resources/
│   │       └── images/
│   │           └── images/ (Contains various image assets used in the UI)
│   └── deo/ (Likely contains data access objects)
│       ├── CategoryDao.java (implied by AddNewProduct.java)
│       └── ProductDao.java (implied by AddNewProduct.java)
│       └── UserDao.java (implied by Login.java and ForgotPassword.java)
└── model/ (Likely contains data models)
    ├── Category.java (implied by AddNewProduct.java)
    └── Product.java (implied by AddNewProduct.java)
    └── User.java (implied by Login.java and ForgotPassword.java)
