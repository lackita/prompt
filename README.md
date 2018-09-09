# prompt

A Clojure library allowing programs to include a simple prompt.

## Installation

[![Clojars Project](https://img.shields.io/clojars/v/prompt.svg)](https://clojars.org/prompt)

## Usage

```(require '[prompt.core :as prompt])
(prompt/start #(if (= % "quit") {:quit true} {:message %}))```

## License

Copyright © 2018 Colin Williams

Distributed under the GPL v3.
