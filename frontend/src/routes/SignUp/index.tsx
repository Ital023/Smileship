import logotipo from "../../assets/logotipo.png";

export default function SignUp() {
  return (

    <main className="bg-secondary-color-bg md:min-h-364">

    <div className="container md:px-32 flex flex-row">

      <div>

        <div>
          <img src={logotipo} alt="logotipo Smileship" />
        </div>

        <h3 className="w-[24rem]">
          Smileship ajuda você a se conectar com amigos, criando laços mais
          fortes e compartilhando momentos especiais.
        </h3>
      </div>

      <div>

        <form>

          <div>
            <div>
              <input type="text" placeholder="Email ou telefone" />
            </div>

            <div>
              <input type="text" placeholder="Senha" />
            </div>

            <button>Entrar</button>
          </div>

          <button>Criar nova conta</button>

        </form>

      </div>
       
    </div>

    </main>
  );
}
