(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))

(aplica-desconto 100)

(defn valor-descontado
  "Retorna o valor descontado que é 50%"
  [valor-bruto]
  (* valor-bruto 0.5))
; "Retorna..." descrição

(valor-descontado 100)

(defn valor-descontado
  [valor-bruto]
  (* valor-descontado (- 1 0.10)))

(valor-descontado 100)

(defn valor-descontado
  [valor-bruto]
  (let [desconto 0.10] ; || / 10 100
    (* valor-descontado (- 1 desconto))))
; tipo de fechamento 
(valor-descontado 100)

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)] ; || / 10 100
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto)))
; tipo de fechamento 
(valor-descontado 100)


(if (> 500 100)
  (println "maior")
  (println "menor ou igual"))

(if (> 50 100)
  (println "maior")
  (println "menor ou igual"))

;if
(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for extritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)] ; || / 10 100
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))))
; tipo de fechamento 
(valor-descontado 100)

;if else
(defn valor-descontado
"Retorna o valor com desconto de 10% se o valor bruto for extritamente maior que 100."
[valor-bruto]
(if (> valor-bruto 100)
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)] ; || / 10 100
    (println "Calculando desconto de" desconto)
    (- valor-bruto desconto))
  valor-bruto))