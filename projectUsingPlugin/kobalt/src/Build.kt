import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val bs = buildScript {
    plugins(file("../plugin/kobaltBuild/libs/issue389-0.1.jar"))
}

val p = project {
    name = "issue389-projectUsingPlugin"
    group = "com.example"
    artifactId = name
    version = "0.1"
}
