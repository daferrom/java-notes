## Types of access modifiers

| Access Type | Private | Protected | Public | Default |
| same class  |YES | YES | YES | YES |
| Same package subclass | NO |  YES | YES | YES |
| Different package subclass | NO | YES | YES | YES |
| Different package non-subclass | NO | NO | YES | NO |

Tips:

* Try to make the classes public
* In one file one class
* Try to keep the instance variable private
* Try to keep the methods public
* If you think a method or variable that requires to be accessed in only package sub class use protected
* Try to avoid Default

