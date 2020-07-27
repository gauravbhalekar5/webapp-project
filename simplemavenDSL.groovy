job('First-Maven-Project-Via-DSL'){
  description('First Maven job generated by the DSL')

    scm {
         git('https://github.com/gauravbhalekar5/webapp-project.git', '*/master')
    }

    triggers {
            scm('* * * * *')
    }
    steps {
         maven('clean, package', 'pom.xml')
    }
    publishers {
         archiveArtifacts ('**/*.war')
         mailer('gauravbhalekar5@gmail.com', true, true)
    }
	
}
