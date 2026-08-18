package com.Infinovus.imhungry.model

import androidx.annotation.DrawableRes

// Core Meal Combinations
enum class PrepMethod {
    FRIED, STIR_FRIED, STEAMED, STEWED, BAKED, POACHED,
    GRILLED, ROASTED, SOUP_BOILED, COLD_RAW
}
enum class CarbType {RICE, NOODLE, PASTA, BREAD, POTATO, NONE}
enum class ProteinType {BEEF, PORK, CHICKEN, LAMB, SEAFOOD, PLANT_BASED}
enum class DrinkType {WATER, SODA, JUICE, ALCOHOLIC, COFFEE, TEA}


// Situation Tags
enum class AllergenTag {
    PEANUT, DAIRY,FISH, EGG,
    ALCOHOL, SOY, GLUTEN, SESAME
}
enum class SituationTag {
    // Age Restriction
    UNDERAGE,

    // Diet && Fitness
    VEGETARIAN, VEGAN, GYM_MUSCLE_BUILDING, GYM_CUTTING,

    // Religion
    HALAL, HINDUISM, BUDDHISM, KOSHER,

    // Health & Biology
    PREGNANCY, MENSTRUATION
}


data class Meal(
    val id: String,
    val mealName: String,
    @DrawableRes val image: Int,

    // core combination
    val prep: List<PrepMethod>,
    val carbs: List<CarbType>,
    val proteins: List<ProteinType>,
    val drink: DrinkType,

    // situation tags
    val containsAllergens: List<AllergenTag> = emptyList(),
    val suitableFor: List<SituationTag> = emptyList()
)