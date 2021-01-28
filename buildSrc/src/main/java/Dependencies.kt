object Dependencies {

  //Kotlin
  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

  // Koin
  const val koinCore = "org.koin:koin-core:${Versions.koin}"
  const val koinCoreExt = "org.koin:koin-core-ext:${Versions.koin}"
  const val koinAndroidScope = "org.koin:koin-androidx-scope:${Versions.koin}"
  const val koinAndroidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
  const val koinAndroidFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
  const val koinAndroidExt = "org.koin:koin-androidx-ext:${Versions.koin}"

  // Coroutine
  const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
  const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
  const val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}"

  //LifeCycle
  const val lifeCycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExt}"
  const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
  const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.runTime}"
  const val lifeCycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.common}"
  const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"

  // Navigation
  const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
  const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

  //Room
  const val room = "androidx.room:room-runtime:${Versions.room}"
  const val roomKapt = "androidx.room:room-compiler:${Versions.room}"
  const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

  //Material
  const val material = "com.google.android.material:material:${Versions.material}"

  //Coil
  const val coil = "io.coil-kt:coil:${Versions.coil}"

  //Lottie
  const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

  //Legacy
  const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
  const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
  const val androidCore = "androidx.core:core-ktx:${Versions.coreKtx}"

  //Constraint
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"

  //Network
  const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
  const val moshiAdapter = "com.squareup.moshi:moshi-adapters:${Versions.moshiAdapter}"
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
  const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
  const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"

}