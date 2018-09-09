# prompt

A Clojure library allowing programs to include a simple prompt.

## Installation

```[prompt "0.1.0"]```

## Usage

```(require '[prompt.core :as prompt])
(prompt/start #(if (= % "quit") {:quit true} {:message %}))```

## License

Copyright © 2018 Colin Williams

Distributed under the GPL v3.
