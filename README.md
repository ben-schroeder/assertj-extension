# assertj-extension
[![Build Status](https://travis-ci.com/ben-schroeder/assertj-extension.svg?branch=master)](https://travis-ci.com/ben-schroeder/assertj-extension)
[![License](https://img.shields.io/github/license/ben-schroeder/assertj-extension)](https://raw.githubusercontent.com/ben-schroeder/assertj-extension/develop/LICENSE)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/assertj-extension/badge.svg)](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/assertj-extension)

Convenience Extension to use assertj without static imports. 

Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/ 

## Requirements
* Java >= 8
* [AssertJ](https://github.com/joel-costigliola/assertj-core) >= 3.14.0

## Versioning

The version corresonds with the used version of assertj-core, so the same version can be used for both. The first release exists for assertj-core 3.14.0

```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>assertj-extension</artifactId>
  <version>${assertj.version}</version>
</dependency>
```

## Usage

```
import eu.benschroeder.assertj.WithAssertJ;

public class MyUnitTest implements WithAssertJ {

    @Test
    void testMyMethod() {

        assumeThat("equals").isEqualTo("equ"+"als");


        assertThat("string").isNotNull();

    }

}
```
