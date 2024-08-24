import {
    Card,
    Input,
    Button,
    Typography,
  } from "@material-tailwind/react";
   
  export function SimpleRegistrationForm() {
    return (
       <Card color="transparent" shadow={false}>

        <form className="mb-2 w-full max-w-screen-lg sm:w-96">
          <div className="mb-1 flex flex-col gap-6">
            <Typography variant="h6" color="white" className="-mb-3">
              Seu nome
            </Typography>
            <Input
              size="lg"
              placeholder="João da Silva"
              className=" !border-t-blue-gray-200 focus:!border-yellow-400"
              labelProps={{
                className: "before:content-none after:content-none",
              }}
            />
            <Typography variant="h6" color="white" className="-mb-3">
                Seu email
            </Typography>
            <Input
              size="lg"
              placeholder="name@mail.com"
              className=" !border-t-blue-gray-200 focus:!border-yellow-400 text-secondary-color-txt"
              labelProps={{
                className: "before:content-none after:content-none",
              }}
            />
            <Typography variant="h6" color="white" className="-mb-3">
              Sua senha
            </Typography>
            <Input
              type="password"
              size="lg"
              placeholder="********"
              className=" !border-t-blue-gray-200 focus:!border-yellow-400"
              labelProps={{
                className: "before:content-none after:content-none",
              }}
            />
          </div>
          
          <Button className="mt-10 bg-blue-600" fullWidth>
            Registrar-se

          </Button>
          <Typography className="mt-4 text-center font-normal text-secondary-color-txt">
            Já tem uma conta?{" "}
            <a href="#" className="font-medium text-secondary-color-txt">
              Sign In
            </a>
          </Typography>
        </form>
      </Card>
    );
  }