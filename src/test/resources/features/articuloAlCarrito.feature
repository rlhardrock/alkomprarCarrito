#language: es
Característica: Buscar un producto y enviarlo al carrito de compras
  Como   director de construcciones civiles
  Quiero buscar articulos para construccion via web en Alkomprar
  Para   adquirir productos a traves de un carrito de compras

  @BusquedaYEnvio
  Escenario: Busqueda de producto con envio al carrito
    Dado      abro la pagina web Alkomprar
    Cuando    busco el producto lo selecciono y envio al carrito de compras
    Entonces  visualizo el carro de compras con el producto adicionado
