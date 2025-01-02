plugins {
    id ("com.android.application")
    id ("kotlin-android")
}

android {
    namespace = "com.cmc.ticket"
    compileSdk = 33  // Remplacez 35 par la dernière version stable

    defaultConfig {
        applicationId = "com.cmc.ticket"
        minSdk = 21
        targetSdk = 33  // Assurez-vous que cela correspond à la version SDK de production
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // AndroidX Libraries
    implementation ("androidx.core:core-ktx:1.9.0") // Utilisez la version la plus récente
    implementation ("com.google.android.material:material:1.6.0") // Version mise à jour pour Material Components
    implementation ("androidx.activity:activity-ktx:1.4.0") // Utilisation de `activity-ktx` si vous avez besoin d'une activité avec extensions Kotlin
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3") // Ajout de la version de ConstraintLayout
    implementation ("androidx.recyclerview:recyclerview:1.2.1") // Utilisation de la dernière version stable

    // Test libraries
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    // AppCompat pour la compatibilité des vues
    implementation ("androidx.appcompat:appcompat:1.4.0") // Mettez à jour selon la version

    // Si vous utilisez des bibliothèques supplémentaires, vous pouvez les ajouter ici
}
