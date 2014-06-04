# debugging

A minimal test case for a strange bug, to wit:

  1. Run the application by doing lein cljsbuild once and lein ring
     server-headless
  2. Visit the page and see that there are no errors in the console
  3. In `project.clj`, replace `[org.clojure/tools.reader "0.8.3"]` with `[org.clojure/tools.reader "0.8.4"]`
  4. Clean rebuild clojurescript with `lein do cljsbuild clean, cljsbuild once`
  5. Visit the page and now there are errors in the console
