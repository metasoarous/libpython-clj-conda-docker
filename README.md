
# Demonstration of problem requiring python modules with libpython-clj2

Install docker and docker compose, then run with

```
docker compose up --build
```

You should then be able to connect to an nREPL over port 3851 (`:Connect 3851` in vim).
The code all runs fine till the line `(require-python '[numpy :as np])`, at which point it errors, saying `ModuleNotFoundError: No module named 'numpy'`.
