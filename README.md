# Viewm Binding

View binding is a feature that allows you to more easily write code that interacts with views.
Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module. An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.


# Setup instructions
Set the viewBinding build option to true in the module-level build.gradle file, as shown in the following example:


# The largest heading
## The second largest heading
###### The smallest heading




   android {
    ...
    buildFeatures {
        viewBinding = true
    }
}
###### If you want a layout file to be ignored while generating binding classes, add the tools:viewBindingIgnore="true" attribute to the root view of that layout file:
 

<LinearLayout
        ...
        tools:viewBindingIgnore="true" >
    ...
</LinearLayout
  
# Use view binding in activities
  
  
private lateinit var binding: ResultProfileBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ResultProfileBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)
}


# Links
[Firebase](https://developer.android.com/topic/libraries/view-binding)
