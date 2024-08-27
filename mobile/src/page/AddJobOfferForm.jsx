import React, { useState } from 'react';
import styled from 'styled-components';
import Background from '../component/common/Background';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import { getCookie } from '../utils/react-cookies';

const FormContainer = styled.div`
    margin-top: 90px;
`;

const Title = styled.h1`
    font-size: 27px;
    color: #000000;
    font-family: 'Pretendard-Bold';
    margin-bottom: 30px;
`;

const Input = styled.input`
    width: 100%;
    height: 55px;
    margin-bottom: 20px;
    font-family: 'Pretendard-Medium';
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;

    &::placeholder {
        color: #BCBCBC;
    }
`;

const Button = styled.button`
    width: 100%;
    height: 50px;
    background-color: #007BFF; // Background color for the button
    color: #ffffff;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    font-family: 'Pretendard-Bold';
    cursor: pointer;
    
    &:hover {
        background-color: #0056b3; // Darker shade for hover effect
    }
`;

const AddJobOfferForm = () => {
    const navigate = useNavigate();

    const addGooin = () => {
        const title = document.getElementById("title").value
        const description = document.getElementById("description").value

        const request = {
            title: title,
            description: description
        }
        axios.post(
            "https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/gooin", 
            request,
            {
                headers: {
                    Authorization: `Bearer ${getCookie("accessToken")}`
                }
            }
        )
            .then(res => {
                navigate("/");
            })
            .catch(err => {
                console.log(err);
            })
    }

    return (
        <Background>
            <FormContainer>
                <Title>구인 글 추가하기</Title>
                <form>
                    <Input
                        type="text"
                        placeholder="제목을 입력해주세요."
                        id="title"
                    />
                    <Input
                        type="text"
                        placeholder="설명을 입력해주세요."
                        id="description"
                    />
                    <Button onClick={addGooin}>추가하기</Button>
                </form>
            </FormContainer>
        </Background>
    );
};

export default AddJobOfferForm;