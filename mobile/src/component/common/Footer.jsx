import styled from "styled-components"

import { IoBook } from "react-icons/io5";
import { useNavigate } from "react-router-dom";
import { IoMdHome } from "react-icons/io";
import { FaBuilding } from "react-icons/fa";
import { IoMdPerson } from "react-icons/io";

export default function Footer() {
    const Background = styled.footer`
        width: 100%;
        height: 7vh;
        display: flex;
        justify-content: space-between;
        border-top: 2px solid #E0E0E0;
    `;

    const ItemButton = styled.button`
        width: 20%;
        height: 100%;
        background-color: white;
        border: 0;
    `;

    const navigate = useNavigate();

    return (
        <Background>
            <ItemButton onClick={() => {navigate("/")}}><IoMdHome size={27} color="gray"/></ItemButton>
            <ItemButton onClick={() => {navigate("/education")}}><IoBook size={25} color="gray"/></ItemButton>
            <ItemButton onClick={() => {navigate("/company-detail")}}><FaBuilding size={25} color="gray"/></ItemButton>
            <ItemButton onClick={() => {navigate("/profile")}}><IoMdPerson size={25} color="gray"/></ItemButton>
        </Background>
    )
}