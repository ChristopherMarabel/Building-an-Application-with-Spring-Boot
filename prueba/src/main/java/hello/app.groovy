@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello fer!";
    }
}