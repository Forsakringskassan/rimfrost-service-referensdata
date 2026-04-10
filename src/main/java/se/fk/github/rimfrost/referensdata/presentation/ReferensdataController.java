package se.fk.github.rimfrost.referensdata.presentation;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;

import java.util.List;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import se.fk.github.rimfrost.referensdata.presentation.provider.ReferensdataProvider;
import se.fk.rimfrost.jaxrsspec.controllers.generatedsource.ReferensdataControllerApi;
import se.fk.rimfrost.jaxrsspec.controllers.generatedsource.model.Referensdata;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class ReferensdataController implements ReferensdataControllerApi
{

   @Inject
   ReferensdataProvider provider;

   @Path("/avsiktstyp/{referensdata_id}")
   @Override
   public Referensdata getAvsiktstyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getAvsiktstyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/avsiktstyp")
   @Override
   public List<Referensdata> getAvsiktstyper()
   {

      return provider.getAvsiktstyper();
   }

   @Path("/avslutstyp/{referensdata_id}")
   @Override
   public Referensdata getAvslutstyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getAvslutstyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/avslutstyp")
   @Override
   public List<Referensdata> getAvslutstyper()
   {
      return provider.getAvslutstyper();
   }

   @Path("/beslutstyp/{referensdata_id}")
   @Override
   public Referensdata getBeslutstyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getBeslutstyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/beslutstyp")
   @Override
   public List<Referensdata> getBeslutstyper()
   {
      return provider.getBeslutstyper();
   }

   @Path("/beslutsutfallstyp/{referensdata_id}")
   @Override
   public Referensdata getBeslutsutfallstyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getBeslutsutfallstyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/beslutsutfallstyp")
   @Override
   public List<Referensdata> getBeslutsutfallstyper()
   {
      return provider.getBeslutsutfallstyper();
   }

   @Path("/erbjudande/{referensdata_id}")
   @Override
   public Referensdata getErbjudande(@PathParam("referensdata_id") String referensdataId)
   {
      return getErbjudanden().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/erbjudande")
   @Override
   public List<Referensdata> getErbjudanden()
   {
      return provider.getErbjudanden();
   }

   @Path("/fssainforationstyp/{referensdata_id}")
   @Override
   public Referensdata getFSSAinformationstyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getFSSAinformationstyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/fssainformationstyp")
   @Override
   public List<Referensdata> getFSSAinformationstyper()
   {
      return provider.getFSSAinformationstyper();
   }

   @Path("/idtyp/{referensdata_id}")
   @Override
   public Referensdata getIdtyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getIdtyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst().orElseThrow(NotFoundException::new);
   }

   @Path("/idtyp")
   @Override
   public List<Referensdata> getIdtyper()
   {
      return provider.getIdtyper();
   }

   @Path("/uppgiftstatustyp/{referensdata_id}")
   @Override
   public Referensdata getUppgiftstatustyp(@PathParam("referensdata_id") String referensdataId)
   {
      return getUppgiftstatustyper().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/uppgiftstatustyp")
   @Override
   public List<Referensdata> getUppgiftstatustyper()
   {
      return provider.getUppgiftstatustyper();
   }

   @Path("/yrkanderoll/{referensdata_id}")
   @Override
   public Referensdata getYrkanderoll(@PathParam("referensdata_id") String referensdataId)
   {
      return getYrkanderoller().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/yrkanderoll")
   @Override
   public List<Referensdata> getYrkanderoller()
   {
      return provider.getYrkanderoller();
   }

   @Path("/yrkandestatus/{referensdata_id}")
   @Override
   public Referensdata getYrkandestatus(String referensdataId)
   {
      return getYrkandestatusar().stream().filter(r -> r.getId().equals(referensdataId)).findFirst()
            .orElseThrow(NotFoundException::new);
   }

   @Path("/yrkandestatus")
   @Override
   public List<Referensdata> getYrkandestatusar()
   {
      return provider.getYrkandestatusar();
   }
}
