import { Avatar, Box, Container, Paper, Typography } from "@mui/material";

import React from "react";

const Footer = () => {
  return (
    <Paper
      sx={{
        marginTop: "calc(10% + 60px)",
        position: "fixed",
        bottom: 0,
        width: "100%",
        background: "rgba(32, 32, 32, 1)",
      }}
      component="footer"
      square
      variant="outlined"
    >
      <Container maxWidth="lg">
        <Box
          sx={{
            flexGrow: 1,
            justifyContent: "center",
            display: "flex",
            my: 1,
            gap:2,
            alignContent:'center'
          }}
        >
          <Avatar
            alt="Remy Sharp"
            src="https://avatars.githubusercontent.com/u/88461868?v=4"
          />
          <Typography
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
            Lance®
          </Typography>
        </Box>

        <Box
          sx={{
            flexGrow: 1,
            justifyContent: "center",
            display: "flex",
            mb: 2,
          }}
        >
          <Typography variant="caption" color="initial">
            Copyright© 2024.
          </Typography>
        </Box>
      </Container>
    </Paper>
  );
};

export default Footer;
