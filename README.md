# assertj-extension
[![Build Status](https://travis-ci.com/ben-schroeder/assertj-extension.svg?branch=develop)](https://travis-ci.com/ben-schroeder/assertj-extension)
[![License](https://img.shields.io/github/license/ben-schroeder/assertj-extension)](https://raw.githubusercontent.com/ben-schroeder/assertj-extension/develop/LICENSE)

Extension to use assertj without static imports. 

Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/ 

## Requirements
* Java >= 8

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
