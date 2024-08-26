import React from 'react';
import styled from 'styled-components';

// Styles
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    background-color: #FFFFFF; /* White background */
    padding: 0;
    margin: 0;
    font-family: 'Pretendard', sans-serif;
`;

const Title = styled.h1`
    font-size: 25px;
    font-weight: 600; /* Pretendard Semibold */
    color: #000000;
    margin: 15px;
`;

const Image = styled.img`
    width: 100%;
    height: 180px;
    object-fit: cover;
    margin-top: 15px;
`;

const ContentContainer = styled.div`
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: space-between;
    padding: 15px;
`;

const Card = styled.div`
    width: 200px;
    height: 200px;
    background: #F5F5F5; /* Background for the card */
    margin-top: 15px;
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`;

const CardImage = styled.img`
    width: 100%;
    height: 130px;
    object-fit: cover;
`;

const CardTitle = styled.h2`
    font-size: 23px;
    font-weight: 500; /* Pretendard Medium */
    color: #000000;
    margin: 10px 0 0 0;
    text-align: center;
`;

const CardSection = styled.div`
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    gap: 15px;
    padding: 0 15px;
`;

// Component
const EducationScreen = () => {
    return (
        <Container>
            <Title>Chapter2</Title>
            <Image src="/path/to/promotion-image.png" alt="Promotional" />
            <ContentContainer>
                <CardSection>
                    <Card>
                        <CardImage src="/path/to/img.png" alt="Basic Startups" />
                        <CardTitle>창업의 기초</CardTitle>
                    </Card>
                    <Card>
                        <CardImage src="/path/to/img.png" alt="Intermediate Startups" />
                        <CardTitle>창업의 중급</CardTitle>
                    </Card>
                </CardSection>
                <CardSection>
                    <Card>
                        <CardImage src="/path/to/img.png" alt="Advanced Startups" />
                        <CardTitle>창업의 심화</CardTitle>
                    </Card>
                    <Card>
                        <CardImage src="/path/to/img.png" alt="Startup Examples" />
                        <CardTitle>창업의 예시</CardTitle>
                    </Card>
                </CardSection>
            </ContentContainer>
        </Container>
    );
};

export default EducationScreen;
