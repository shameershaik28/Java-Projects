# Language Families

Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

In the project, Java can help with building a model to track inherited traits across families. In this case, we’ll focus on something that often varies between language families: word order — where the subject, verb, and object would go in a sentence.

For example, in English, you would use subject-verb-object order:

| Subject | Verb | Object  |
| ------- | ---- | ------- |
| She     | eats | noodles |

But in Japanese, you would use subject-object-verb order:

| Subject | Object  | Verb   |
| ------- | ------- | ------ |
| 彼女は  | 麺を    | 食べる |
| She     | noodles | eats   |

The Language Inheritance package has three Java files:

1. Language.java: for the Language parent class, which serves as the template for all languages.
1. Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family ([Source](https://en.wikipedia.org/wiki/Mayan_languages)).
1. SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family ([Source](https://en.wikipedia.org/wiki/Sino-Tibetan_languages)).

Inspired by Codecademy's Language Families project.
