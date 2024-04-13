Cálculo de la distancia de edición.

Mi código funciona formando una matriz, compuesta por la longitud de las dos palabras. Para poder ir moviendome por la matriz utilizo dos bucles for uno con i y otro con j. Con unos condicionales, el primero funciona cuando este vacío el s1, es decir i=0, devuelve j. El segundo cuando esta vacío el s2, es decir j=0, devuelve i. Por último, sino se cumplen estas condiciones, en la matriz se guarda el minimo coste después de que haya hecho la sustitución, eliminación e inserción y nos la devuelve con lo guardado.

Copyright [2024] [Ignacio Tirado Meza]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.