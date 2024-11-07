"use client";
import * as React from "react";
import AppBar from "@mui/material/AppBar";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Container from "@mui/material/Container";
import Avatar from "@mui/material/Avatar";
import Button from "@mui/material/Button";

const pages = [ "categorias", "contacto"];

function ResponsiveAppBar() {


  return (
    <AppBar position="static" >
      <Container maxWidth="xl" sx={{ backgroundColor: "rgba((64,4,56)" }}   >
        <Toolbar disableGutters>
          <Box
            sx={{
              gap: 2,
              display: "flex",
              flexDirection: "row",
              alignContent: "center",
            }}
          >
            <Avatar
              alt="Remy Sharp"
              src="https://avatars.githubusercontent.com/u/88461868?v=4"
            />
            <Typography
              variant="h6"
              noWrap
              component="a"
              sx={{
                mr: 2,
                display: { xs: "none", md: "flex" },
                fontFamily: "monospace",
                fontWeight: 700,
                letterSpacing: ".3rem",
                color: "inherit",
                textDecoration: "none",
                alignSelf:'center '

              }}
            >
              Canela store  
            </Typography>
          </Box>
    
          <Box sx={{ flexGrow: 1, display: { xs: "none", md: "flex" , gap: 10} }}>
          <Button
                href={`/`}
                sx={{ my: 2, color: "white", display: "block" }}
                
              >
                Inicio
              </Button>
            {pages.map((page) => (
              <Button
                key={page}
                href={`/${page}`}
                sx={{ my: 2, color: "white", display: "block" }}
                
              >
                {page}
              </Button>
            ))}
          </Box>
        </Toolbar>
      </Container>
    </AppBar>
  );
}
export default ResponsiveAppBar;
