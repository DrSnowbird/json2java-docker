# JSON to Java (Pojo) Classes - Generate Java Classes using JSON (text)
* Based upon [joelittlejohn/jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo)
* For details, please go the the above web site since this GIT is just a Docker Container Wrapper over it.
# Build (Docker)
```
make build
```

# Run (Docker-based command line)

```
./run.sh [<options>]
```
The command will transfer all **[<options>]** to actual **jsonschema2pojo [<options>]** inside the Container. For options, see the guide for usage below.

## Examples
The default ".env" automatically map ./json into Container. Hence the following example will work correctly. If you want to use different JSON file on your Host directory, you need to edit ".env" to define proper Volume mapping to work.
```
./run.sh -a JACKSON2 -T JSON -sl -p my-package -j -s /home/developer/json/city-distances.json -t /home/developer/json/java-gen

$ ll json
total 20
drwxr-xr-x 3 rsheu rsheu 4096 Aug  3 18:24 ./
drwxr-xr-x 7 rsheu rsheu 4096 Aug  3 18:22 ../
-rw-r--r-- 1 rsheu rsheu  786 May 25 14:18 city-distances.json
-rw-r--r-- 1 rsheu rsheu  154 May 25 14:18 example.json
drwxr-xr-x 3 rsheu rsheu 4096 Aug  3 18:24 java-gen/

And, your generated Java file are here:
$ find json/java-gen
json/java-gen
json/java-gen/my-package
json/java-gen/my-package/Cities.java
json/java-gen/my-package/CityDistances.java
json/java-gen/my-package/Amsterdam.java
json/java-gen/my-package/London.java
json/java-gen/my-package/Brussel.java
json/java-gen/my-package/Pari.java
```
Note the above "-s <json file>" is the location relative to the inside of Container (not your host OS)

## Usage
Note that "*" Options are required (mandatory) below.
```
Usage: jsonschema2pojo [options]
  Options:
    -a, --annotation-style
       Options: [JACKSON, JACKSON1, JACKSON2, GSON, MOSHI1, NONE]
       Default: JACKSON
    -i, --big-decimals
       Use BigDecimal instead of double (or Double) when the JSON Schema type
       'number' is encountered. Note that this overrides -f/--float-numbers
       Default: false
    -bi, --big-integers
       Use BigInteger instead of int (or Integer) when the JSON Schema type
       'integer' is encountered. Note that this overrides -l/--long-integers
       Default: false
    -y, --class-prefix
       Prefix for generated class.
       Default: <empty string>
    -x, --class-suffix
       Suffix for generated class.
       Default: <empty string>
    -c3, --commons-lang3
       Deprecated. Please remove it from your command-line arguments.
       Default: false
        --constructors-include-all-properties-constructor
       Generate a constructor with all fields
       Default: true
        --constructors-include-copy-constructor
       Generate constructors with a copy oriented parameter
       Default: false
        --constructors-include-required-properties-constructor
       Generate a constructor with only required fields
       Default: false
    -r, --constructors-required-only
       Generate only a constructor with only required fields
       Default: false
    -A, --custom-annotator
       The fully qualified class name of referring to a custom annotator class
       that implements org.jsonschema2pojo.Annotator and will be used in addition to
       the --annotation-style. If you want to use a custom annotator alone, set
       --annotation-style to none
       Default: class org.jsonschema2pojo.NoopAnnotator
    -F, --custom-rule-factory
       The fully qualified class name of referring to a custom rule factory
       class that extends org.jsonschema2pojo.rules.RuleFactory to create custom rules
       for code generation.
       Default: class org.jsonschema2pojo.rules.RuleFactory
    -dt, --date-class
       Specify date class
    -dp, --date-pattern
       A custom pattern to use when formatting date fields during serialization
    -dtp, --date-time-pattern
       A custom pattern to use when formatting date-time fields during
       serialization
    -dtt, --datetime-class
       Specify datetime class
    -dg, --disable-getters
       Whether to omit getter methods and create public fields instead.
       Default: false
    -ds, --disable-setters
       Whether to omit setter methods and create public fields instead.
       Default: false
    -D, --enable-additional-properties
       Enable additional properties support on generated types, regardless of
       the input schema(s)
       Default: false
    -fe, --file-extensions
       The extensions that should be considered as standard filename extensions
       when creating java class names.
       Default: <empty string>
    -f, --float-numbers
       Use float (or Float) instead of double (or Double) when the JSON Schema
       type 'number' is encountered
       Default: false
    -fdt, --format-date-times
       Whether the fields of type `date-time` are formatted during serialization
       with a default pattern of `yyyy-MM-dd'T'HH:mm:ss.SSSZ` and timezone set to
       default value of `UTC`
       Default: false
    -fd, --format-dates
       Whether the fields of type `date` are formatted during serialization with
       a default pattern of `yyyy-MM-dd`
       Default: false
    -ft, --format-times
       Whether the fields of type `time` are formatted during serialization with
       a default pattern of `HH:mm:ss.SSS`
       Default: false
    -ftm, --format-type-mapping
       Mapping from format identifier to type: <format>:<fully.qualified.Type>.
       Default: []
    -b, --generate-builders
       Generate builder-style methods as well as setters
       Default: false
    -c, --generate-constructors
       Generate constructors
       Default: false
    -h, --help
       Print help information and exit
       Default: false
        --include-constructor-properties-annotation
       Generate ConstructorProperties annotation with parameter names of
       constructors. (Not Available on Android)
       Default: false
    -ida, --include-dynamic-accessors
       Include dynamic getter, setter, and builder support on generated types.
       Default: false
    -idb, --include-dynamic-builders
       Include dynamic builder support on generated types.
       Default: false
    -idg, --include-dynamic-getters
       Include dynamic getter support on generated types.
       Default: false
    -ids, --include-dynamic-setters
       Include dynamic setter support on generated types.
       Default: false
        --include-type-info
       Include json type info; required to support polymorphic type handling. https://github.com/FasterXML/jackson-docs/wiki/JacksonPolymorphicDeserialization
       Default: false
    -il, --inclusion-level
       Options: [ALWAYS, NON_ABSENT, NON_DEFAULT, NON_EMPTY, NON_NULL,
       USE_DEFAULTS]
       Default: NON_NULL
    -j, --joda-dates
       Whether to use org.joda.time.DateTime instead of java.util.Date when
       adding date-time type fields to generated Java types.
       Default: false
    -jd, --joda-local-dates
       Whether to use org.joda.time.LocalDate insteadof String when adding date
       type fields to generated Java types.
       Default: false
    -jt, --joda-local-times
       Whether to use org.joda.time.LocalTime insteadof String when adding time
       type fields to generated Java types.
       Default: false
    -303, --jsr303-annotations
       Add JSR-303/349 annotations to generated Java types.
       Default: false
    -305, --jsr305-annotations
       Add JSR-305 annotations to generated Java types.
       Default: false
    -l, --long-integers
       Use long (or Long) instead of int (or Integer) when the JSON Schema type
       'integer' is encountered
       Default: false
    -N, --null-collections
       Initialize Set and List fields to null instead of an empty collection.
       Default: false
    -E, --omit-hashcode-and-equals
       Omit hashCode and equals methods in the generated Java types
       Default: false
    -S, --omit-tostring
       Omit the toString method in the generated Java types
       Default: false
    -e, --output-encoding
       The character encoding that should be used when writing the generated
       Java source files.
       Default: UTF-8
    -p, --package
       A java package used for generated types
    -pl, --parcelable
       **EXPERIMENTAL** Whether to make the generated types 'parcelable' (for
       Android development).
       Default: false
        --print-log-levels
       Prints available log levels and exit.
       Default: false
    -rpd, --ref-fragment-path-delimiters
       A string containing any characters that should act as path delimiters
       when resolving $ref fragments. By default, #, / and . are used in an attempt
       to support JSON Pointer and JSON Path.
       Default: #/.
    -R, --remove-old-output
       Whether to empty the target directory before generation occurs, to clear
       out all source files that have been generated previously (indiscriminately
       deletes all files and folders).
       Default: false
    -sl, --serializable
       Whether to make the generated types 'serializable'.
       Default: false
  * -s, --source
       The source file(s) or directory(ies) from which JSON Schema will be read
    -sso, --source-sort-order
       The sort order to be applied to the source files.  Available options are:
       OS, FILES_FIRST or SUBDIRS_FIRST
       Default: OS
    -T, --source-type
       Options: [JSONSCHEMA, JSON, YAMLSCHEMA, YAML]
       Default: JSONSCHEMA
  * -t, --target
       The target directory into which generated types will be written
    -tl, --target-language
       The type of code that will be generated.  Available options are: JAVA or
       SCALA
       Default: JAVA
    -tv, --target-version
       The target version for generated source files.
       Default: 1.6
    -tt, --time-class
       Specify time class
    -tp, --time-pattern
       A custom pattern to use when formatting time fields during serialization
    -tse, --tostring-excludes
       The fields that should be excluded from generated toString methods
       Default: <empty string>
        --use-inner-class-builders
       Generate an inner class with builder-style methods
       Default: false
    -o, --use-optional-for-getters
       Use Optional for getters of non-required fields.
       Default: false
    -P, --use-primitives
       Use primitives instead of wrapper types for bean properties
       Default: false
    -d, --word-delimiters
       The characters that should be considered as word delimiters when creating
       Java Bean property names from JSON property names
       Default: - _
    -log
       Configure log level. Defaults to info. Available options are: off, error,
       warn, info, debug, trace
       Default: info
    -ut, --use-title-as-classname, When set class names are generated from title attributes rather than property names.
       
       Default: false
```


