/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airhacks.service.ping.boundary;

import jakarta.ejb.Stateless;
import java.security.Principal;
import javax.inject.Inject;
import org.eclipse.microprofile.faulttolerance.Asynchronous;

@Stateless
public class AsyncService {
    @Inject
    Principal principal;

    @Asynchronous
    public String name() {
        return principal.getName();
    }

}
