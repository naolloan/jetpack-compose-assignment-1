package com.example.courselistapp.data

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val credits: Int,
    val description: String,
    val prerequisites: String,
    val isFavorite: Boolean = false
)

val sampleCourses = listOf(
    Course(
        id = 1,
        title = "Mobile App Development",
        code = "CS-451",
        credits = 4,
        description = "Build Android apps with Jetpack Compose and Kotlin.",
        prerequisites = "CS-101"
    ),
    Course(
        id = 2,
        title = "Data Structures",
        code = "CS-201",
        credits = 3,
        description = "Learn about arrays, linked lists, and algorithms.",
        prerequisites = "CS-101"
    ),
    Course(
        id = 3,
        title = "Algorithms",
        code = "CS-301",
        credits = 4,
        description = "Study sorting, searching, and graph algorithms.",
        prerequisites = "CS-201"
    ),
    Course(
        id = 4,
        title = "Database Systems",
        code = "CS-321",
        credits = 3,
        description = "Relational database design, SQL, normalization, transactions, and NoSQL databases.",
        prerequisites = "CS-201"
    ),
    Course(
        id = 5,
        title = "Operating Systems",
        code = "CS-401",
        credits = 4,
        description = "Process management, memory management, file systems, and concurrency control.",
        prerequisites = "CS-301"
    ),
    Course(
        id = 6,
        title = "Computer Networks",
        code = "CS-411",
        credits = 3,
        description = "Network architectures, protocols, TCP/IP stack, and network security fundamentals.",
        prerequisites = "CS-301"
    ),
    Course(
        id = 7,
        title = "Artificial Intelligence",
        code = "CS-471",
        credits = 4,
        description = "Fundamentals of AI including search algorithms, machine learning, and neural networks.",
        prerequisites = "CS-301, MATH-251"
    ),
    Course(
        id = 8,
        title = "Software Engineering",
        code = "CS-361",
        credits = 3,
        description = "Software development lifecycle, design patterns, testing, and agile methodologies.",
        prerequisites = "CS-201"
    )
)