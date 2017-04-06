import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val bs = buildScript {
    repos()
}

val p = project {

    name = "issue389"
    group = "com.example"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("com.beust:kobalt-plugin-api:")
    }

    assemble {
        jar {
        }
    }

}
