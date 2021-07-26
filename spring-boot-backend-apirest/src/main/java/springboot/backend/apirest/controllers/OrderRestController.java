package springboot.backend.apirest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OrderRestController {

	@GetMapping("/test")

	@ApiOperation(value = "Test")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Consulta exitosa", response = String.class),
			@ApiResponse(code = 400, message = "API_RESPONSE_COD_400"),
			@ApiResponse(code = 422, message = "API_RESPONSE_COD_422"),
			@ApiResponse(code = 500, message = "API_RESPONSE_COD_500") })
	public ResponseEntity<String> index() {

		return new ResponseEntity<String>("Prueba", HttpStatus.OK);
	}

	@GetMapping("/servicio")

	@ApiOperation(value = "servicio")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Consulta exitosa", response = String.class),
			@ApiResponse(code = 400, message = "API_RESPONSE_COD_400"),
			@ApiResponse(code = 422, message = "API_RESPONSE_COD_422"),
			@ApiResponse(code = 500, message = "API_RESPONSE_COD_500") })
	
	public ResponseEntity<String> servicio() {

		
		return new ResponseEntity<String>("Prueba", HttpStatus.OK);
	}

}
