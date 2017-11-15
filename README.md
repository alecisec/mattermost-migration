# Mattermost DB Migration Program

This program migrates `Mattermost database` from postgresql to mysql, or vice versa.

## Pre-requirements

### System Requirements

* JDK 7 (or higher) + Maven 3

* Can connect on both (postgresql/mysql) database system at the same time.

### Conditions

* Using same version of Mattermost.
 
 ```
ex) v4.3.2 Mattermost running on postgresql database
 
 to  v4.3.2 Mattermost running on mysql database
 ```
 
Recommend updating both source mattermost install and the destination/trunkated DB to 4.3.2
This may work on later versions however please observe any changes to schema (paste 4.3.2) noted here https://docs.mattermost.com/administration/changelog.html


## How-to-migrate

### Clone this repository on machine's local path.
`git clone [repository path]`

### Initialize target database.

* Set `mattermost/config/config.json` to target database

* Run `mattermost/bin/platform` to create initial Mattermost schema.

> Run mattermost (./bin/platform) and stop (Ctrl + C) when initialize complete.

* Truncate all tables.

>Normally truncating the `Systems` table will be enough. (At first, other table is empty)

### Rename `application.properties.default` to `application.properties`

* Program will read application.properties

### Setting program's `application.properties`

* Make sure that database's driver, url, username, password are correct.


### Run program using maven exec. 

```
 mvn compile exec:java -Dexec.mainClass="com.navercorp.mattermost.migration.Main"
```
alternatively use the included shell script

```
sh run.sh
```

This command will download libraries, compile classes, and run migration program.

## Used Libraries

This program uses following libraries at it's build time.

|Library Name| Version|
|---|---|
|Spring Framework|4.3.2|
|Spring Batch|3.0.7|
|Mysql JDBC Connector|5.1.31|
|Postgresql JDBC Connector|9.4.1208.jre7|
|Lombok|1.16.8|
|Snakeyaml|1.17|


## Limitations

This is **not official migration program**, it uses *not recommended way* to migration.

(In fact, there is no recommended way to migration at now.)
 
This program may make wrong result on target database, so you MUST check migrated data before you shutdown original database.

## License

Apache License 2.0

## Original Code by

Sang Jun Lee \<sjun.lee@navercorp.com\>
