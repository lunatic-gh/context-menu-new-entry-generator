<h2>This program can generate entries for Windows 11's "New" context menu.</h2>

<h3>How to use:</h3>
- Open a terminal
- Run this file with `java -jar generator.jar [extension] [display-name]`.
  - The Extension is the .extension of your file you want to create with the entry.
  - The Displayname is the final name that is shown in the "New" Menu for the entry.
- It will generate a `.reg` file, which on execution will create a few registry keys/values for the menu.
- Restart Windows Explorer (Or Relogin/Restart your pc)
- The entry should appear


<h3>NOTE: This messes with your Windows Registry. Alltho this shouldn't happen, I AM NOT RESPONSIBLE FOR ANY BROKEN WINDOWS INSTALLS OR BURNING HOUSES.</h3>
<h3>ALWAYS LOOK AT THE GENERATED REG-FILE BEFORE EXECUTING IT. IT SHOULD LOOK SIMILAR TO THIS:</h3>

```reg
Windows Registry Editor Version 5.00

[HKEY_CLASSES_ROOT\.yml]
@="ymlKeyNew"

[HKEY_CLASSES_ROOT\.yml\ShellNew]
"NullFile"=""

[HKEY_CLASSES_ROOT\ymlKeyNew]
@="Yaml Document"

```
