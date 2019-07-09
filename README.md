# Jewelry Logic

### Description
Service Layer for Jewelry site

#### .m2/settings.xml:

```
<settings>
     <profiles>
         <profile>
             <id>myMavenRepo</id>
             <activation>
                 <property>
                     <name>!doNotUseMyMavenRepo</name>
                 </property>
             </activation>
             <properties>
                 <myMavenRepo.read.url>тут read url</myMavenRepo.read.url>
                 <myMavenRepo.write.url>тут write url</myMavenRepo.write.url>
             </properties>
         </profile>
     </profiles>
 </settings>
 ```