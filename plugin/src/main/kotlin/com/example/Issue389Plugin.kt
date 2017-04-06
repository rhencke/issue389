package com.example

import com.beust.kobalt.api.*
import com.beust.kobalt.HostConfig

class Issue389Plugin : BasePlugin(), IRepoContributor {
    override val name = "issue389"

    override fun reposFor(project: Project?): List<HostConfig> {
        if (project == null) {
            return emptyList()
        }

        return listOf(HostConfig("repo.jenkins-ci.org/public"))
    }
}