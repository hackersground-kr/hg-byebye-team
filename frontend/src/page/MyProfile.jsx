import axios from "axios";
import { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const MyInfo = styled.div`
    height: 40%;
    width: 100%;
    background-color: white;
`;

const Background = styled.div`
    height: 100%;
    width: 100%;
    background-color: #D0D0D0;
`;

const ListButton = styled.button`
    width: 100%;
    height: 5vh;
    background-color: white;
    border: 1px solid #D0D0D0;
`;

const MyPage = () => {
    const navigate = useNavigate();

    useEffect(() => {
        axios.get("server url")
            .then((res) => {

            })
            .catch((err) => {
                //navigate("/login");
            })
    }, [])

    return (
        <Background>
            <MyInfo>
                <span>sdf</span><br/>
                <span>010-1234-1234</span>
            </MyInfo>
            <ListButton>개인정보처리방침</ListButton>
            <ListButton>로그아웃</ListButton>
            <ListButton>회원탈퇴</ListButton>
        </Background>
    );
}

export default MyPage;