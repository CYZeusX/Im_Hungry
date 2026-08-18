package com.Infinovus.imhungry.model

enum class PrepMethod {}
enum class CarbType {RICE, PASTA, BREAD, POTATO}
enum class ProteinType {BEEF, PORK, CHICKEN, SEAFOOD}
enum class DrinkType {WATER, SODA, JUICE, ALCOHOLIC, COFFEE, TEA}

enum class Allergen {
    PEANUT, MILK, DAIRY,
    FISH, EGG, ALCOHOL,
    SOY, WHEAT_GLUTEN,
    SESAME
}

enum class DietaryTag {
    // Age Restriction
    UNDERAGE,

    // Diet && Fitness
    VEGETARIAN, VEGAN, GYM_MUSCLE_BUILDING, GYM_CUTTING,

    // Religion
    HALAL, HINDUISM, BUDDHISM, JUDAISM, CHRISTIANITY,

    // Health & Biology
    PREGNANCY, MENSTRUATION,
}

data class Meal(
    val id: String,
    val meal: List<String>,
    val image: Int,

    // User Friendly
    val isVegetarian: Boolean = false,
    val isGlutenFree: Boolean = false,
    val isPregnant: Boolean = false,
    val isMenstruation: Boolean = false,
    val isInGym: Boolean = false,
    val isBuddhist: Boolean = false,
    val isIslamic: Boolean = false
)

data class Allergic(
    val peanut: Boolean = false
)