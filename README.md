# How to run from Terminal
**For web config local mode:**

gradle clean test --tests WebTest -Denv=local

**For web config remote mode:**

gradle clean test --tests WebTest -Denv=remote

**For api config using system properties:**

gradle clean test --tests ApiTest -DbaseUrl= -Dtoken=

**For api config using file:**

gradle clean test --tests ApiTest
