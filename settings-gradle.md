# `settings.gradle` File

## Purposes

- Add subprojects to the build process (that means it is not required if the project does not contain subprojects)
- Set the project name

## Example

```text
rootProject.name = "my-project"

include("subprojectA")
include("subprojectB")
```

## See also

- [Basic parts](README.md#next)