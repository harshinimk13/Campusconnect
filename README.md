# CampusConnect – Android Application

 

## 1. Experiment Overview

 

CampusConnect is an Android application developed using Kotlin and XML-based Views. The application demonstrates Activities, Fragments, Views, Intents, Android Notifications, and Activity lifecycle methods through a college student portal scenario.

 

## 2. Aim

 

To develop an Android application named CampusConnect using basic Views, Activities, Fragments, Intents, Notifications, and Activity lifecycle methods.

 

## 3. Scenario

 

CampusConnect is a simple college student portal application. Students can view their profile and register for a course. After selecting a course and semester, the application opens a registration confirmation screen and generates an Android notification confirming successful registration.

 

## 4. Concepts / Technologies Used

 

- **Kotlin** – Programming language used for application logic.

- **XML Views** – Used to design the user interface.

- **Activities** – Used for the application entry point, Home screen, and Registration Confirmation screen.

- **Fragments** – Used for Student Profile and Course Registration sections.

- **Views** – ImageView, TextView, Button, EditText, RadioButton, RadioGroup and FragmentContainerView.

- **Intent** – Used for navigation and passing course and semester data.

- **Notifications** – Used to confirm successful course registration.

- **Activity Lifecycle** – Methods such as `onCreate()` are demonstrated and lifecycle events can be observed in Logcat.

 

## 5. Application Features

 

- JGI logo displayed on the Home screen.

- CampusConnect application title.

- Welcome message.

- Student Profile button.

- Course Registration button.

- Student name, USN and email display.

- Gender selection using RadioButton and RadioGroup.

- Course name input using EditText.

- Semester selection using RadioButton and RadioGroup.

- Input validation.

- Registration confirmation using Intent.

- Display of selected course and semester.

- Back to Home button.

- Android notification for successful registration.

- Activity lifecycle events demonstrated using Logcat.

 

## 6. Project Folder and File Structure

 

```text

CampusConnect/

│

├── app/

│   └── src/

│       └── main/

│           ├── java/

│           │   └── com/

│           │       └── example/

│           │           └── campuconnect/

│           │               ├── MainActivity.kt

│           │               ├── HomeActivity.kt

│           │               ├── ProfileFragment.kt

│           │               ├── CourseRegistrationFragment.kt

│           │               └── RegistrationConfirmationActivity.kt

│           │

│           ├── res/

│           │   ├── drawable/

│           │   │   └── jgi_logo.png

│           │   └── layout/

│           │       ├── activity_home.xml

│           │       ├── fragment_profile.xml

│           │       ├── fragment_course_registration.xml

│           │       └── activity_registration_confirmation.xml

│           │

│           └── AndroidManifest.xml

│

├── Screenshots/

│   ├── Output1.png

│   ├── Output2.png

│   ├── Output3.png

│   └── Output4.png

│

└── README.md

```

 

## 7. Important Source Files

 

- `MainActivity.kt` – Requests notification permission on Android 13+ and launches HomeActivity.

- `HomeActivity.kt` – Displays the Home screen and loads the Profile and Course Registration fragments.

- `ProfileFragment.kt` – Displays student profile information and gender options.

- `CourseRegistrationFragment.kt` – Accepts course name, validates semester selection, and sends data using an Intent.

- `RegistrationConfirmationActivity.kt` – Displays registration details and generates the success notification.

- `activity_home.xml` – Defines the Home screen interface.

- `fragment_profile.xml` – Defines the Student Profile interface.

- `fragment_course_registration.xml` – Defines the Course Registration interface.

- `activity_registration_confirmation.xml` – Defines the Registration Confirmation interface.

- `AndroidManifest.xml` – Declares permissions and application activities.

 

## 8. Application Flow

 

```text

                    START

                      |

                      v

              +---------------+

              | MainActivity   |

              +---------------+

                      |

                      v

              +---------------+

              |  Home Screen  |

              +---------------+

                /           \

               /             \

              v               v

    +----------------+   +----------------------+

    | Student Profile|   | Course Registration  |

    |    Fragment    |   |      Fragment        |

    +----------------+   +----------------------+

                              |

                              v

                       Enter Course Name

                              |

                              v

                       Select Semester

                              |

                              v

                           Register

                              |

                              v

              +-----------------------------+

              | Registration Confirmation   |

              |          Activity           |

              +-----------------------------+

                       |             |

                       v             v

                 Show Details     Notification

                       |

                       v

                  Back to Home

```

 

## 9. Test Cases

 

### Test Case 1 – Home Screen

 

**Test Objective:**  

To verify that the Home screen is displayed correctly.

 

**Steps:**

1. Launch the CampusConnect application.

2. Wait for the Home screen to appear.

 

**Expected Result:**  

The Home screen should display the JGI logo, CampusConnect title, welcome message, Student Profile button and Course Registration button.

 

**Screenshot:**  

[Output 1 – Home Screen](https://github.com/harshinimk13/Campusconnect/blob/main/Screenshots/Output1.png)

 

---

 

### Test Case 2 – Student Profile

 

**Test Objective:**  

To verify that the Student Profile Fragment works correctly.

 

**Steps:**

1. Launch the application.

2. Tap the Student Profile button.

 

**Expected Result:**  

The Student Profile Fragment should display Student Name, USN, Email and Gender RadioButton options.

 

**Screenshot:**  

[Output 2 – Student Profile](https://github.com/harshinimk13/Campusconnect/blob/main/Screenshots/Output2.png)

 

---

 

### Test Case 3 – Course Registration and Confirmation

 

**Test Objective:**  

To verify course registration, Intent navigation, confirmation and notification.

 

**Steps:**

1. Launch the application.

2. Tap Course Registration.

3. Enter the course name.

4. Select a semester.

5. Tap Register.

 

**Expected Result:**  

The application should open the Registration Confirmation Activity, display the selected course and semester, provide a Back to Home button, and generate a successful registration notification.

 

**Screenshots:**

- [Output 3 – Course Registration](https://github.com/harshinimk13/Campusconnect/blob/main/Screenshots/Output3.png)

- [Output 4 – Registration Confirmation / Notification](https://github.com/harshinimk13/Campusconnect/blob/main/Screenshots/Output4.png)

 

## 10. Output Screenshots

 

The screenshots used to demonstrate the application are available in the `Screenshots` folder.

 

| Screenshot | Description |

|------------|-------------|

| Output1.png | CampusConnect Home Screen |

| Output2.png | Student Profile |

| Output3.png | Course Registration |

| Output4.png | Registration Confirmation / Notification |

 

## 11. Result

 

The CampusConnect Android application was successfully developed using Kotlin and XML Views. Activities, Fragments, Views, Intents, Notifications and Activity lifecycle concepts were implemented successfully. Student profile viewing and course registration were demonstrated with confirmation and notification.

 

## 12. Conclusion

 

The CampusConnect application demonstrates the development of a basic Android application using fundamental Android components. The experiment provides practical understanding of designing Android user interfaces using XML, using Activities and Fragments, handling user input, passing data using Intents, generating Android notifications, and observing Activity lifecycle methods.

 

