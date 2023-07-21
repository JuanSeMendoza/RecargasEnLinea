select b.nombre as Operador,
       c.apellido as Apellido_vendedor,
       c.nombre as Nombre_vendedor,
       a.valor as Valor_recarga
from tbl_recargas a
INNER JOIN tbl_operador b on (b.id_operador = a.fk_id_operador)
INNER JOIN tbl_vendedor c on (c.id_vendedor = a.fk_id_vendedor)
