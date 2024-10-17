

public class Snippet {
		
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID idalimento ;
	private String proteina, carboidrato, fibra, gordura, bebida, sobremesa;
}