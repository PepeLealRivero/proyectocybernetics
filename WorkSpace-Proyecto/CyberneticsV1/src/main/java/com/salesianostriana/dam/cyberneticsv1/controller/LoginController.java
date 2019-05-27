/**
 * 
 */
package com.salesianostriana.dam.cyberneticsv1.controller;

/**
 * @author lealr
 *
 */
/*@Controller
public class LoginController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private HttpSession session;

	@GetMapping("/login")
	public String verLogin(Model model) {
		return "/login";
	}

	@PostMapping("/login")
	public String logIn(@ModelAttribute("loginForm") Alumno alumno, Model model) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		alumno.setPass(passwordEncoder.encode(alumno.getPass()));

		if (usuarioService.findOneByNomUser(alumno.getNomUser()) == null
				|| usuarioService.findOneByEmail(alumno.getEmail()) == null) {

			model.addAttribute("errorLogin", "El usuario o email no coinciden");
			return "login";
		} else {
			
			return "inicio";
		}

	}

}*/
