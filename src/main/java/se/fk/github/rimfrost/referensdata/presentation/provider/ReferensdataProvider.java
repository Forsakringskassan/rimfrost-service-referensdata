package se.fk.github.rimfrost.referensdata.presentation.provider;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.jaxrsspec.controllers.generatedsource.model.Referensdata;

import java.util.ArrayList;
import java.util.List;

@SuppressFBWarnings("EI_EXPOSE_REP")
@ApplicationScoped
public class ReferensdataProvider
{
   private final static List<Referensdata> AVSIKTSTYPER = new ArrayList<>(List.of(
         createReferensdata("dae2ffc3-07c8-4686-a3d5-58bc942dfe06", "NY", "Ny"),
         createReferensdata("559f7158-5f02-4c97-823a-8048d36f6244", "ANDRING", "Ändring"),
         createReferensdata("84b21e8b-4b94-4473-b791-1d4ca9de54c5", "BORTTAG", "Borttag"),
         createReferensdata("98c266fd-bdb1-4bbd-8c71-75017881e2e1", "ATERTAG", "Återtag")));

   private final static List<Referensdata> AVSLUTSTYPER = new ArrayList<>(List.of(
         createReferensdata("4f114b7e-b70d-4c6b-91d1-42a54acaaaa1", "AVVISNING", "Avvisning"),
         createReferensdata("0b643a7d-fa4d-48f8-9b31-1e7bc5ef5590", "AVSKRIVNING", "Avskrivning"),
         createReferensdata("0b9c0048-34a1-4b69-ace7-1e68fe33c2de", "PROVAD", "Sakfråga prövad")));

   private final static List<Referensdata> BESLUTSTYPER = new ArrayList<>(List.of(
         createReferensdata("e0a88da6-7bf1-47b7-88a3-59cfa029a3d5", "INTERIMISTISKT", "Interimistiskt beslut"),
         createReferensdata("dced16fa-087f-45c8-9167-9da784324b8b", "PROVISORISKT",
               "Provisoriskt beslut enl. art 7 i EU-förordningen 978/2009"),
         createReferensdata("856cbfb3-c1c7-480e-94ee-42b7291848ca", "SLUTGILTIGT", "Slutgiltigt beslut"),
         createReferensdata("04a1a178-e32f-4418-8dbb-86e6e6d0e915", "OMPROVNING", "Omprövningsbeslut"),
         createReferensdata("5447ee89-ac2c-4d9d-96eb-4663225b2514", "ANDRING", "Ändringsbeslut")));

   private final static List<Referensdata> BESLUTSUTFALLSTYPER = new ArrayList<>(List.of(
         createReferensdata("459bfc9e-c0d4-40d8-b9b5-56ec0801332c", "BEVILJAT", "Beviljat"),
         createReferensdata("40aa3f5c-b6fd-490e-964e-03d0314732c2", "AVSLAG", "Avslag"),
         createReferensdata("098ac3a7-307c-4ca4-92b7-f532050d2554", "DELVISAVSLAG", "Delvis avslag"),
         createReferensdata("fe07691a-7b5f-4f33-9afa-096987524dfd", "OKNING", "Ökning"),
         createReferensdata("a39b652a-dbf4-4964-af47-f34306859607", "MINSKNING", "Minskning"),
         createReferensdata("2274c2b7-6396-43a7-ab7f-281d24811f4f", "INDRAG", "Indrag"),
         createReferensdata("ba405055-b501-404b-b148-8260c295f7a7", "ANDRING", "Ändring"),
         createReferensdata("c676f4e1-2352-459d-b6e7-039ecc51e7cb", "DELVISANDRING", "Delvis ändring"),
         createReferensdata("ee9acfb9-33f4-47c5-afca-6c90ef8608dc", "INGENANDRING", "Ingen ändring")));

   private final static List<Referensdata> ERBJUDANDEN = new ArrayList<>(List.of(
         createReferensdata("7d4a6c38-348b-4f46-9278-b1bfeabc0353", "VAH-1", "Ansökan om tillfällig vård av husdjur"),
         createReferensdata("256470a0-671f-433d-80bc-2bf6ba097868", "VAH-2", "Ansökan om tillfällig vård av boskap")));

   private final static List<Referensdata> FSSAINFORMATIONSTYPER = new ArrayList<>(List.of(
         createReferensdata("50eb9944-34cb-498f-b137-c74709d89d3f", "HANDLAGGNING_PAGAR", "Handläggning pågår"),
         createReferensdata("fe4a2d86-7db2-48fd-b849-ab0a39e72b74", "INFORMATION_FRAN_ANNAN_PART",
               "Väntar på information från annan part"),
         createReferensdata("f5d66c96-32a1-4dcc-8149-f90f608590bb", "INVANTAR_INFORMATION_FRAN_KUND",
               "Väntar på information från dig (kunden)")));

   private final static List<Referensdata> IDTYPER = new ArrayList<>(List.of(
         createReferensdata("c5f2e2b4-9143-4160-8f4b-30c172f0ac05", "PNR", "Pnr"),
         createReferensdata("da36a3d4-5e6d-4baa-8fac-390bec043204", "KUNDID", "KundID"),
         createReferensdata("116759e4-18fd-4209-849c-90abbd257d22", "KORTNUMMER", "Kortnummer"),
         createReferensdata("1b1c2e3f-500e-487d-84b6-079dc662c2be", "ORGNUMMER", "Orgnummer"),
         createReferensdata("15941878-cd6a-4730-9337-5a9fcb5d7fea", "REGNR", "Regnr (husdjur)")));

   private final static List<Referensdata> UPPGIFTSTATUSTYPER = new ArrayList<>(List.of(
         createReferensdata("c7477256-eabd-4ff2-833a-2db9051caf86", "PLANERAD", "Planerad"),
         createReferensdata("0b202a3f-052d-450a-8866-ae141a80d289", "TILLDELAD", "Tilldelad"),
         createReferensdata("5161d678-3835-454c-979b-dc1c9e06beac", "AVSLUTAD", "Avslutad")));

   private final static List<Referensdata> YRKANDEROLLER = new ArrayList<>(List.of(
         createReferensdata("80f5f41f-9e55-4fc2-a076-ad5a651e0a9d", "SOKANDE", "Sökande"),
         createReferensdata("dfc73dbc-576e-409b-ac85-a7734a157de9", "SAKFRAGAN_AVSER", "Den som sakfrågan avser"),
         createReferensdata("541c2d7e-4b41-4030-94d2-fd5781233a19", "OMBUD", "Ombud/Ställföreträdare"),
         createReferensdata("a9dd900d-b97c-4ffa-a7bf-26885ab8ade7", "HUSDJUR", "Husdjuret"),
         createReferensdata("c23e48aa-6219-469a-ae25-3d036d662d3a", "BOSKAP", "Boskap")));

   private final static List<Referensdata> YRKANDESTATUSAR = new ArrayList<>(List.of(
         createReferensdata("bae3c392-fbf4-4e16-8937-c27e93edf4e4", "PLANERAT", "Planerat"),
         createReferensdata("e27da561-a8db-4513-8272-ef652b097b16", "YRKAT", "Yrkat"),
         createReferensdata("ca5135b5-71e8-49ae-943c-026b1e34b033", "UTREDNING", "Under utredning"),
         createReferensdata("d4e3ed5b-c35d-4d36-9db1-36f3b8e13e4a", "FASTSTALLT_UTREDNING", "Fastställt under utredning"),
         createReferensdata("ff483a54-0909-4947-b0ec-a0618b861e70", "FASTSTALLT", "Fastställt")));

   public List<Referensdata> getAvsiktstyper()
   {
      return AVSIKTSTYPER;
   }

   public List<Referensdata> getAvslutstyper()
   {
      return AVSLUTSTYPER;
   }

   public List<Referensdata> getBeslutstyper()
   {
      return BESLUTSTYPER;
   }

   public List<Referensdata> getBeslutsutfallstyper()
   {
      return BESLUTSUTFALLSTYPER;
   }

   public List<Referensdata> getErbjudanden()
   {
      return ERBJUDANDEN;
   }

   public List<Referensdata> getFSSAinformationstyper()
   {
      return FSSAINFORMATIONSTYPER;
   }

   public List<Referensdata> getIdtyper()
   {
      return IDTYPER;
   }

   public List<Referensdata> getUppgiftstatustyper()
   {
      return UPPGIFTSTATUSTYPER;
   }

   public List<Referensdata> getYrkanderoller()
   {
      return YRKANDEROLLER;
   }

   public List<Referensdata> getYrkandestatusar()
   {
      return YRKANDESTATUSAR;
   }

   private static Referensdata createReferensdata(String id, String kod, String namn)
   {
      Referensdata referensdata = new Referensdata();
      referensdata.setId(id);
      referensdata.setKod(kod);
      referensdata.setNamn(namn);

      return referensdata;
   }
}
