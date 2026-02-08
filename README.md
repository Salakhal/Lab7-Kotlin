# Kotlin Nullability Lab 🧪

Ce projet fait partie du cours **Fondamentaux de la programmation en Kotlin**. Il explore les concepts de sécurité contre la nullité (Null Safety).



## 📋 Concepts abordés
* **Type Nullable (`Student?`)** : Autorise une variable à contenir `null`.
* **Assertion Non-Null (`!!`)** : Force la conversion d'un type nullable en non-nullable (provoque un crash si la valeur est `null`).
* **Opérateur Elvis (`?:`)** : Fournit une valeur de remplacement sécurisée en cas de `null`.

## 🚀 Scénarios de Test
Le programme permet de tester trois comportements :

1. **Cas de succès** : L'ID et le nom existent dans la liste.
2. **Crash volontaire** : Entrer un ID inexistant (ex: `999`) pour observer une `NullPointerException` causée par l'opérateur `!!`.
3. **Gestion d'erreur propre** : Entrer un nom inexistant pour voir l'opérateur `?:` renvoyer "the student is not found".

