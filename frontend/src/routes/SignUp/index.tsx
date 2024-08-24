import logotipo from "../../assets/logotipo.png";
import { SimpleRegistrationForm } from "../../components/SimpleRegistrationForm";

export default function SignUp() {
  return (
    <main className="min-h-screen bg-secondary-color-bg">

      <div className="container md:px-32 flex flex-col p-3 gap-10">

          <div className="mt-5 flex flex-col gap-8">

            <div className="flex justify-center content-center">
              <img src={logotipo} alt="logotipo Smileship" className="w-56" />
            </div>

            <h3 className="lg:max-w-[673px] font-OpenSans text-sm text-center text-secondary-color-txt">
              Smileship ajuda você a se conectar com amigos, criando laços mais
              fortes e compartilhando momentos especiais.
            </h3>
          </div>

          <div className="flex flex-col gap-4 p-2">
            <h3 className="text-center text-secondary-color-txt text-2xl font-bold">Inscreva-se</h3>
            <form className="flex flex-col justify-center content-center">

              <SimpleRegistrationForm/>

                
            </form>
          </div>

      </div>
    </main>
  );
}
